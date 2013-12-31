package com.dslplatform.ocd.aggregates.ListOptStringInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptStringAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptString: IndexedSeq[Option[String]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptStringInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptStringAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptStringAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptStringInAggregate.ListOptStringAggregate): this.type = {
    this.URI = result.URI;
    this._listOptString = result._listOptString;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptStringInAggregate.ListOptStringAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptString")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptString = {
    _listOptString
  }

  def listOptString_= (value: IndexedSeq[Option[String]]) {
    _listOptString = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptString") listOptString: IndexedSeq[Option[String]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptString = if (listOptString == null) IndexedSeq.empty else listOptString)

}

object ListOptStringAggregate extends AggregateRootCompanion[ListOptStringAggregate]{

  def apply(
    listOptString: IndexedSeq[Option[String]] = IndexedSeq[Option[String]]()
  ) = {
    new ListOptStringAggregate(
      _locator = None
    , _URI = null
    , _listOptString = listOptString)
  }

}
