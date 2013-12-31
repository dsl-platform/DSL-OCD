package com.dslplatform.ocd.aggregates.ListIntInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListIntAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listInt: IndexedSeq[Int]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListIntInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListIntAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListIntAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListIntInAggregate.ListIntAggregate): this.type = {
    this.URI = result.URI;
    this._listInt = result._listInt;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListIntInAggregate.ListIntAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listInt")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listInt = {
    _listInt
  }

  def listInt_= (value: IndexedSeq[Int]) {
    _listInt = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listInt") listInt: IndexedSeq[Int]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listInt = if (listInt == null) IndexedSeq.empty else listInt)

}

object ListIntAggregate extends AggregateRootCompanion[ListIntAggregate]{

  def apply(
    listInt: IndexedSeq[Int] = IndexedSeq[Int]()
  ) = {
    new ListIntAggregate(
      _locator = None
    , _URI = null
    , _listInt = listInt)
  }

}
