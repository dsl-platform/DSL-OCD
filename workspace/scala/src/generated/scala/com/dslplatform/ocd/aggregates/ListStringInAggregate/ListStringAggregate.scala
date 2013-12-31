package com.dslplatform.ocd.aggregates.ListStringInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListStringAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listString: IndexedSeq[String]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListStringInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListStringAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListStringAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListStringInAggregate.ListStringAggregate): this.type = {
    this.URI = result.URI;
    this._listString = result._listString;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListStringInAggregate.ListStringAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listString")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listString = {
    _listString
  }

  def listString_= (value: IndexedSeq[String]) {
    _listString = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listString") listString: IndexedSeq[String]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listString = if (listString == null) IndexedSeq.empty else listString)

}

object ListStringAggregate extends AggregateRootCompanion[ListStringAggregate]{

  def apply(
    listString: IndexedSeq[String] = IndexedSeq[String]()
  ) = {
    new ListStringAggregate(
      _locator = None
    , _URI = null
    , _listString = listString)
  }

}
