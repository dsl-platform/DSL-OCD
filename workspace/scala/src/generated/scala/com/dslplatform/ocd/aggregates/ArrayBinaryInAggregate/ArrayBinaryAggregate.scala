package com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayBinaryAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayBinary: Array[Array[Byte]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayBinaryInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayBinaryAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayBinaryAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate.ArrayBinaryAggregate): this.type = {
    this.URI = result.URI;
    this._arrayBinary = result._arrayBinary;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate.ArrayBinaryAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayBinary")
  def arrayBinary = {
    _arrayBinary
  }

  def arrayBinary_= (value: Array[Array[Byte]]) {
    _arrayBinary = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayBinary") arrayBinary: Array[Array[Byte]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayBinary = if (arrayBinary == null) Array.empty else arrayBinary)

}

object ArrayBinaryAggregate extends AggregateRootCompanion[ArrayBinaryAggregate]{

  def apply(
    arrayBinary: Array[Array[Byte]] = Array.empty
  ) = {
    new ArrayBinaryAggregate(
      _locator = None
    , _URI = null
    , _arrayBinary = arrayBinary)
  }

}
